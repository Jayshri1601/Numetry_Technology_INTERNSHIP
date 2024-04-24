document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Prevent form submission
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
  
    // Perform authentication here (e.g., check against a database)
    // Dummy authentication
    var role = authenticate(username, password);
  
    if (role) {
      // Redirect user based on their role
      switch (role) {
        case 'admin':
          window.location.href = 'admin.html';
          break;
        case 'manager':
          window.location.href = 'manager.html';
          break;
        case 'staff':
          window.location.href = 'staff.html';
          break;
        case 'employee':
          window.location.href = 'employee.html';
          break;
      }
    } else {
      alert('Invalid username or password!');
    }
  });
  
  // Dummy authentication function (replace with actual authentication logic)
  function authenticate(username, password) {
    // Here you would typically check credentials against a database
    // For demo purposes, using hardcoded credentials
    var users = {
      'admin': 'admin123',
      'manager': 'manager123',
      'staff': 'staff123',
      'employee': 'employee123'
    };
  
    for (var user in users) {
      if (username === user && password === users[user]) {
        return user;
      }
    }
    return null;
  }
  