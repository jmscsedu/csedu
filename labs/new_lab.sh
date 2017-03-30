#!/bin/bash
# Simple bash script for generating the file structure for a new lab.

# Create the directory structure:
mkdir "lab_$1"
mkdir "lab_$1/exemplars"
mkdir "lab_$1/files"

# Create symbolic links to the `includes` and `graphics` folders:
ln -s ../includes "lab_$1/includes"
ln -s ../graphics "lab_$1/graphics"

# Create a copy of the template.tex file with the lab name:
cp template.tex "lab_$1/lab_$1.tex"

