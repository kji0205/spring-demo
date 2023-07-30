console.log(123123)
const token = searchParam('token');
console.log(token);
if (token) {
    localStorage.setItem("access_token", token);
}

function searchParam(key) {
    return new URLSearchParams(location.search).get(key);
}