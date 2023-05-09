const baseUrl = window.location.protocol + "//" + window.location.host + "/oxified_front_end/oxified/";
const overlay = document.getElementById("overlay");
window.onload = async function() {
    //add container to main-page
    const response = await fetch(baseUrl + `layout/container.html`);
    const html = await response.text();
    document.getElementById("main-page").innerHTML = html;
    // add navbar to container tmp-nav-bar
    const navBar = await fetch(`loggedNavBar.html`);
    const htmlNav = await navBar.text();
    document.getElementById("tmp-nav-bar").innerHTML = htmlNav;

     // add profle to container tmp-nav-display
     const profile = await fetch(baseUrl + `layout/display/profile.html`);
     const htmlProfile = await profile.text();
     document.getElementById("tmp-nav-display").innerHTML = htmlProfile;
}
async function displayPage(page) {
    const profile = await fetch(baseUrl + `${page}.html`);
     const htmlProfile = await profile.text();
     document.getElementById("tmp-nav-display").innerHTML = htmlProfile;
}

async function logout() {
    location.replace(baseUrl);
    sessionObj = {};
}