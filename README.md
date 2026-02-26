# My DevOps Project
```bash
User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate
$ git init
Initialized empty Git repository in C:/Users/User/IdeaProjects/git-devops-ci-cd-gate/.git/

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (master)
$ git checkout -b main
Switched to a new branch 'main'

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git config --global user.name "Reponse"

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git config --global user.email "reponseiduha777@gmail.com"

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ echo "# My DevOps Project" > README.md

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git add README.md
warning: in the working copy of 'README.md', LF will be replaced by CRLF the next time Git touches it

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git commit -m "chore: initial project setup"
[main (root-commit) a886395] chore: initial project setup
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git remote add origin https://github.com/Reponse2024/git-devops-ci-cd-gate.git

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git remote -v
origin  https://github.com/Reponse2024/git-devops-ci-cd-gate.git (fetch)
origin  https://github.com/Reponse2024/git-devops-ci-cd-gate.git (push)

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git push -u origin main
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Writing objects: 100% (3/3), 246 bytes | 123.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git push -u origin main
Username for 'https://github.com': 
Password for 'https://github.com': 

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git checkout -b dev
Switched to a new branch 'dev'

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (dev)
$ git push -u origin dev
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/Reponse2024/git-devops-ci-cd-gate/pull/new/dev
remote: 
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
 * [new branch]      dev -> dev
branch 'dev' set up to track 'origin/dev'.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (dev)
$ git checkout -b test
Switched to a new branch 'test'

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (test)
$ git push -u origin test
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'test' on GitHub by visiting:
remote:      https://github.com/Reponse2024/git-devops-ci-cd-gate/pull/new/test
remote: 
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
 * [new branch]      test -> test
branch 'test' set up to track 'origin/test'.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (test)
$ git branch
  dev
  main
* test

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (test)
$ git checkout dev
Switched to branch 'dev'
Your branch is up to date with 'origin/dev'.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (dev)
$ git branch -d test
Deleted branch test (was a886395).

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (dev)
$ git push origin --delete test
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
 - [deleted]         test

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (dev)
$ git checkout -b ft/setup
Switched to a new branch 'ft/setup'

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git push -u origin ft/setup
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote: 
remote: Create a pull request for 'ft/setup' on GitHub by visiting:
remote:      https://github.com/Reponse2024/git-devops-ci-cd-gate/pull/new/ft/setup
remote: 
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
 * [new branch]      ft/setup -> ft/setup
branch 'ft/setup' set up to track 'origin/ft/setup'.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ cat > test.java << 'EOF'
// Test.java - Placeholder class for setup validation
// This file is used to verify the Git workflow and CI pipeline setup

public class Test {

    // Main method - entry point of the application
EOF }running.");ut.println("Hello, " + name + "! CI/CD pipelin

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git add test.java
warning: in the working copy of 'test.java', LF will be replaced by CRLF the next time Git touches it

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git commit -m "feat(setup): add Test.java with placeholder logic for pipeline validation"
[ft/setup 4990868] feat(setup): add Test.java with placeholder logic for pipeline validation
 1 file changed, 16 insertions(+)
 create mode 100644 test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ echo "// TODO: add more test cases later" >> test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git status
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   test.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore
        .idea/
        pom.xml

no changes added to commit (use "git add" and/or "git commit -a")

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git stash save "WIP: adding todo comment to test.java"
warning: in the working copy of 'test.java', LF will be replaced by CRLF the next time Git touches it
Saved working directory and index state On ft/setup: WIP: adding todo comment to test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git status
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
  (use "git push" to publish your local commits)

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore
        .idea/
        pom.xml

nothing added to commit but untracked files present (use "git add" to track)

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git stash list
stash@{0}: On ft/setup: WIP: adding todo comment to test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git stash pop stash@{0}
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   test.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore
        .idea/
        pom.xml

no changes added to commit (use "git add" and/or "git commit -a")
Dropped stash@{0} (8cbc8783aa1223e9cf50cade7eefe56930cb8365)

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git status
On branch ft/setup
Your branch is ahead of 'origin/ft/setup' by 1 commit.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   test.java

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore
        .idea/
        pom.xml

no changes added to commit (use "git add" and/or "git commit -a")

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ cat test.java
// Test.java - Placeholder class for setup validation
// This file is used to verify the Git workflow and CI pipeline setup

public class Test {

    // Main method - entry point of the application
    public static void main(String[] args) {
        System.out.println("Setup verified successfully.");
        greet("DevOps Student");
    }

    // Simple greeting method to demonstrate basic logic
    public static void greet(String name) {
        System.out.println("Hello, " + name + "! CI/CD pipeline is running.");
    }
}
// TODO: add more test cases later

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git push origin ft/setup
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 629 bytes | 314.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
   a886395..4990868  ft/setup -> ft/setup

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git add test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git commit -m "Fix: Modified test.java"
[ft/setup c6c007d] Fix: Modified test.java
 5 files changed, 38 insertions(+)
 create mode 100644 .idea/.gitignore
 create mode 100644 .idea/encodings.xml
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/vcs.xml

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git push
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Enumerating objects: 10, done.
Counting objects: 100% (10/10), done.
Delta compression using up to 4 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 1.24 KiB | 181.00 KiB/s, done.
Total 8 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
   4990868..c6c007d  ft/setup -> ft/setup

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git checkout main
Switched to branch 'main'
Your branch is up to date with 'origin/main'.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ cat > test.java << 'EOF'
// Test.java - Placeholder class for setup validation
// This file is used to verify the Git workflow and CI pipeline setup

public class Test {

    // Main method - entry point of the application
EOF }running.");ut.println("Hello, " + name + "! CI/CD pipelin

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ sed -i 's/Setup verified successfully./Main branch version: Setup complete./' test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git add test.java
warning: in the working copy of 'test.java', LF will be replaced by CRLF the next time Git touches it

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git commit -m "fix: update setup message in main branch"
[main 0f1956d] fix: update setup message in main branch
 1 file changed, 16 insertions(+)
 create mode 100644 test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git push origin main
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 603 bytes | 603.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
   a886395..0f1956d  main -> main

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git add .
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.idea/workspace.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git commit -m "Fix: Changed print line of test.java"
[main 4e29207] Fix: Changed print line of test.java
 4 files changed, 125 insertions(+)
 create mode 100644 .gitignore
 create mode 100644 .idea/misc.xml
 create mode 100644 .idea/workspace.xml
 create mode 100644 pom.xml

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (main)
$ git checkout ft/setup
Switched to branch 'ft/setup'
Your branch is up to date with 'origin/ft/setup'.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git merge main
Auto-merging .idea/misc.xml
CONFLICT (add/add): Merge conflict in .idea/misc.xml
Auto-merging test.java
CONFLICT (add/add): Merge conflict in test.java
Automatic merge failed; fix conflicts and then commit the result.

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup|MERGING)
$ git add test.java

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup|MERGING)
$ git commit -m "fix: resolve merge conflict between ft/setup and main"
[ft/setup 2d7a9d1] fix: resolve merge conflict between ft/setup and main

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)
$ git push origin ft/setup
Username for 'https://github.com': Reponse2024
Password for 'https://Reponse2024@github.com': 
Enumerating objects: 17, done.
Counting objects: 100% (17/17), done.
Delta compression using up to 4 threads
Compressing objects: 100% (11/11), done.
Writing objects: 100% (11/11), 2.61 KiB | 445.00 KiB/s, done.
Total 11 (delta 4), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (4/4), completed with 3 local objects.
To https://github.com/Reponse2024/git-devops-ci-cd-gate.git
   c6c007d..2d7a9d1  ft/setup -> ft/setup

User@DESKTOP-2F2N4IJ MINGW64 ~/IdeaProjects/git-devops-ci-cd-gate (ft/setup)                                                
$ 
```
