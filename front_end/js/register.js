//get modal
let modal = document.getElementById("register");

// get the button that opens the modal
let btn = document.getElementById("btn-join");

//get the element that closes the modal
let span = document.getElementsByClassName("close")[0];

//when the user clicks the button, open the modal
btn.onclick = function() {
    modal.style.display = "block";
}

//when user clicks on <span> (x), close the modal
span.onclick = function() {
    modal.style.display = "none";
}

// when the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}