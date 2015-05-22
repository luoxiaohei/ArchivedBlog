@echo off
echo Start clean
cmd /c hexo clean
echo Start generate
cmd /c hexo g
echo Start deploy
cmd /c hexo d
echo Clean files
cmd /c hexo clean
echo Start upload source files
git add .
if "%1" == "" (
    git commit -m "update source files") else (
    git commit -m %1)
git push origin master:source