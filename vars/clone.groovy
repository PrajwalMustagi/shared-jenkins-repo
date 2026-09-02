def call (String url, String branch) {
  echo 'Code cloneing started'
  git url: url, branch: branch
}
