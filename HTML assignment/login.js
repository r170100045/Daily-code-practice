const userList = [
    { username: "admin", password: "admin" },
    { username: "vineetks", password: "vineetks" },
    { username: "rohit", password: "Rohit@123" },
    { username: "kishan", password: "Kishan@123" },
    { username: "sumit", password: "Sumit@123" }
]

function loginVerify() {
    let username = document.getElementById('user').value;
    let pass = document.getElementById('password').value;
    var count = 0;
    for (let i = 0; i < userList.length; i++) {
        if (username == userList[i].username && pass == userList[i].password) {
            location.href = "profile.html";
            localStorage.setItem(JSON.stringify(userList[i]));
            localStorage.clear();
            break;
        }
        count++;
    }
    if (count == userList.length) {
        alert("User does not exist please signup");
    }
}