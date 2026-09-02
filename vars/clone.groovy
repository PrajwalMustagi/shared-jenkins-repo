def call (string url, string branch) {
  echo 'Code cloneing started'
  git url: $url, branch: $branch
}
