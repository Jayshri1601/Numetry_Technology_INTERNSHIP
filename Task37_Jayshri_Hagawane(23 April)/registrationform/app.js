angular.module('registrationApp', [])
.controller('RegistrationController', function() {
  var vm = this;
  vm.student = {};

  vm.submitForm = function() {
    // Here you can handle the form submission logic, such as sending the data to a server
    console.log('Form submitted with data:', vm.student);
  };
});
