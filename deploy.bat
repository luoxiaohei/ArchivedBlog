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
git commit -a -m "update source files"
git push origin master:master