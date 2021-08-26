const userInfo = [
    { eid: "" }, { name: "" }, { dob: "" }, { email: "" },
    { phone: "" }
]
document.getElementById("eid").innerHTML = "Employee Id: " +
    userInfo[eid];
document.getElementById("name").innerHTML = "Name of Employee: " +
    userInfo[name];
document.getElementById("dob").innerHTML = "Date of Birth: " + userInfo[dob];
document.getElementById("email").innerHTML = "Email: " +
    userInfo[email];
document.getElementById("phone").innerHTML = "Contact number: " +
    userInfo[phone];