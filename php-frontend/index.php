<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>User Viewer</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
  <div class="container mt-5">
    <h1 class="mb-4">User Info Viewer</h1>
    <div class="card">
      <div class="card-body">
        <?php
          $apiUrl = "http://localhost:8080/users";
          $response = @file_get_contents($apiUrl);
          $users = json_decode($response, true);

          if ($users && is_array($users)) {
              echo '<ul class="list-group">';
              foreach ($users as $user) {
                  echo '<li class="list-group-item">';
                  echo '<strong>' . htmlspecialchars($user['name']) . '</strong> - ' . htmlspecialchars($user['email']);
                  echo '</li>';
              }
              echo '</ul>';
          } else {
              echo '<p class="text-danger">Failed to load user data.</p>';
          }
        ?>
      </div>
    </div>
  </div>
</body>
</html>
