$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $PSScriptRoot
$upstream = Join-Path $root "_upstream\sources\commonMain\androidx\compose\material3\tokens"
$forked = Join-Path $root "library\src\commonMain\kotlin\com\genev4\tokens"

if (-not (Test-Path $upstream)) { throw "Missing upstream tokens at $upstream" }
if (-not (Test-Path $forked)) { throw "Missing forked tokens at $forked" }

function Get-NormalizedTokenMap($dir) {
    $map = @{}
    Get-ChildItem $dir -Filter *.kt | ForEach-Object {
        $text = [System.IO.File]::ReadAllText($_.FullName).Replace("`r`n", "`n")
        $text = $text.Replace("androidx.compose.material3", "com.genev4")
        $map[$_.Name] = $text
    }
    return $map
}

$up = Get-NormalizedTokenMap $upstream
$fk = Get-NormalizedTokenMap $forked

$missing = @()
$extra = @()
$changed = @()

foreach ($name in $up.Keys) {
    if (-not $fk.ContainsKey($name)) { $missing += $name; continue }
    if ($up[$name] -ne $fk[$name]) { $changed += $name }
}
foreach ($name in $fk.Keys) {
    if (-not $up.ContainsKey($name)) { $extra += $name }
}

if ($missing.Count -or $extra.Count -or $changed.Count) {
    Write-Host "TOKEN PARITY FAILED against material3-android 1.4.0"
    if ($missing) { Write-Host "Missing: $($missing -join ', ')" }
    if ($extra) { Write-Host "Extra: $($extra -join ', ')" }
    if ($changed) { Write-Host "Changed (besides package): $($changed -join ', ')" }
    exit 1
}

Write-Host "TOKEN PARITY OK: $($up.Count) token files match androidx material3 1.4.0 (package name excluded)."
exit 0
