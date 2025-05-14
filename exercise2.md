# Exercise2

This file summarises the function of the most common git commands and the exercise serves to introduce basic git features

## git config

Allows the adjustment of configuration settings in git (like changing the user)

## git init

Configures a new git repository in the current folder (if none is present)

## git commit

Commits all changes that were previously added with `git add` to the repository. `-m` allows to immediately set a commit message instead of having to open a text editor.

## git status

Shows the current status of the repository including all staged (added with `git add`), changed, untracked, or deleted files.

## git add

Adds files and directories to the staging area. A dot or an asterisk `./*` allows to add all changes at once.

## git log

Shows a history of commits in the current repository and branch (in case of two diverging branches, it will only show the history that has led to the currently active one)

## git pull

Pulls all not currently present data from a remote repository like Github or Gitlab

## git push

Pushes local changes to a remote repository

## git branch

Creates a new branch from the currently active repository with the given name

## git checkout

Changes branches. Using the `-b` option you can combine `git branch` and `git checkout` to create a branch and immediately switch to it: `git checkout -b <new branch>`

## git merge

Merges two branches together. Potential merge conflicts might have to be resolved manually