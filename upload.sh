#!/bin/sh

if ["$1" = ""]
then
	message="Upload source files"
else
	message="$1"
fi
sudo git add .
sudo git commit -m "$message"
sudo git push origin master:source
