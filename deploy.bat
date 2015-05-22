@echo off
set auto=0
set commit_message=%2

if "%1" == "c" (
    goto clean) else if "%1" == "d" (
    goto deploy) else if "%1" == "u" (
    goto upload) else (
        set auto=1
        set commit_message=%1
    )

:clean
echo Start clean
cmd /c hexo clean
if %auto% == 0 (
    goto end)

:deploy
echo Start deploy
cmd /c hexo d
if %auto% == 0 (
    goto end)

:upload
echo Start upload source files
git add .
if "%commit_message%" == "" (
    set commit_message="update source files")
git commit -m %commit_message%
git push origin master:source

:end