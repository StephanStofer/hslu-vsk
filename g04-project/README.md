# g04-project

Contains all organisation and documentation files as well as project issues.


## git

### feature branches
A separate branch for every issue shall be created. Create a branch via gitlab Issue->"Create branch" function.

Feature branch pattern: *#issueID-issue-name*

### create new branch
In console type:

`git checkout master`

`git pull`

`git checkout -b feature_issueID`
  

### commits
Commit pattern: *verb + short explanation g04-project#issueID*

### merge
Merge request shall be done via gitlab and not on the local repo.
### commits
Commit pattern: *verb + short explanation #issueID*

### merging
As a developer compleeted an issue - the following procedure is to be done

1.  Check wether the Increment is localy buildable - don't even try to merge a build breaking increment! ;-)
2.  In Gitlab create a mergerequest for your increment-branch back to the master and add the other dev's as reviewers
3.  Once at least one reviewer has approved the change - merge it back to the master
