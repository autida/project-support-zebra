$(document).ready(function(){
    let modal = $("#messenger")
    modal.append(`<div class="modal-container">
    <div class="modal-content">
        <div class="messenger">
            <div class="search-container">
                <div class="search-content">
                    <input type="text" class="search" placeholder="Search"/>
                </div>
            </div>
            <div class="inbox-container">
                <div class="inbox-content">
                    <div class="grid messages">
                        <div class="message-inbox">
                            <div class="message-inbox-container">
                                <div class="message-inbox-content">
                                    <div class="not-my-profile-picture">
                                        <img class = "inbox-profile-picture" src="../images/profile.png" alt="">
                                    </div>
                                    <div class="not-my-name-last-message">
                                        <div class="not-my-name">
                                            John Doe
                                        </div>
                                        <div class="last-message weight-normal">
                                            Last message..
                                        </div>
                                    </div>
                                    <div class="message-time weight-normal">
                                        7:30AM
                                    </div>
                                    <div class="right-angle-icon">
                                        <img src="" alt="">
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="message-inbox">
                            <div class="message-inbox-container">
                                <div class="message-inbox-content">
                                    <div class="not-my-profile-picture">
                                        <img class = "inbox-profile-picture" src="../images/profile.png" alt="">
                                    </div>
                                    <div class="not-my-name-last-message">
                                        <div class="not-my-name">
                                            John Doe
                                        </div>
                                        <div class="last-message weight-normal">
                                            Last message..
                                        </div>
                                    </div>
                                    <div class="message-time weight-normal">
                                        7:30AM
                                    </div>
                                    <div class="right-angle-icon">
                                        <img src="" alt="">
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <div class = "convo">
            <div class = "convo-container">
                <div class = "convo-header flex center space-between">    
                    <div class = "btn-message-back"><img src = "../images/messages.svg" /></div>
                    <div class ="not-my-name">John Doe</div>
                    <div class ="goto-icon"><a href = "#"><img class = "more-info-icon" src="../images/more-info.png"/></a></div>
                </div>
                <div class = "convo-main-container">
                    <div class = "convo-main-content">
                        <div class = "grid convos one-column">

                            <div class = "messages-container ">
                                <div class = "message-content flex">
                                    <div class = "message-profile-picture-container flex center">
                                        <img class = "flex-item" src="../images/profile.png" />
                                    </div>
                                    <div class = "message-body not-mine">
                                        <p>Not my Message here...</p>
                                        <span class = "message-time not-mine">7:00AM</span>
                                    </div>
                                </div>
                            </div>

                            <div class = "messages-container">
                                <div class = "message-content">
                                    <div class = "message-body">
                                        <p> my Message here...</p>
                                        <span class = "message-time">7:00AM</span>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    
                </div>
            </div>
        </div>
        <div class="btn-messenger" data-open = false> 
            <img class = "chatbox-icon" src = "../images/messages.svg">
        </div>
    </div>
    </div>`)
    $(".btn-messenger").click("click", ()=>{

        let btn = $(".btn-messenger")
        let messenger = $(".messenger")
        
        let messengerIsOpen = btn.attr("data-open") == 'true' 
        messenger.toggleClass("show")
        if(!messengerIsOpen) {
            $(".chatbox-icon").attr("src", "../images/cancel.svg")
            
        } else {
        
            messenger.removeClass("clicked")
            $(".convo").removeClass("show")
            $(".chatbox-icon").attr("src", "../images/messages.svg")
        }

        btn.attr("data-open", !messengerIsOpen) 
        
    })
    $(".message-inbox-content").on("click", ()=>{
        $(".messenger.show").toggleClass("clicked")
        $(".convo").toggleClass("show")
    }) 
    $(".btn-message-back").on("click", ()=>{
        $(".convo").removeClass("show")
        $(".messenger.show").removeClass("clicked")
    })
})