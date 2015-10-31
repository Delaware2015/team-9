// Function to log the response from the Mandrill API
function log(obj) {
    $('#response').text(JSON.stringify(obj));
}

// Created a new instance of the Mandrill class with API key
//var mandrill = require('mandrill-api/mandrill');
var m = new mandrill.Mandrill('sTfSo_LFFJd5d-m3mKrP7Q');


function sendTheMail(task,userName,userEmail,patronEmail,deadline) {
// Send the email!
    var reminder = {
    "message": {
        "from_email":"team9@code4good.com",
        "to":[{"email":userEmail}],
        "subject": "Reminder: " + task + " due tomorrow!",
        "text": "Hi "+ userName + "!\nYou have " + task + " due tomorrow! Let's start working on it!"
    }
};
    var escalate = {
        "message": {
            "from_email":"team9@code4good.com",
            "to":[{"email":patronEmail}],
            "subject": "Missed Deadline: " + task + " missed",
            "text": "Hi there! \nIt appears " + userName + " has " + task + " missed the task due yesterday."
        }
    };
    
	//All dates truncated to basic string form of YYYYMMDD
	
	var tomorrow =  new Date((new Date()).valueOf() + 1000*60*60*24);
    var tomS = tomorrow.toISOString().slice(0,10).replace(/-/g,"");
    
    var yesterday = new Date((new Date()).valueOf() - 1000*60*60*24);
    var yestS = yesterday.toISOString().slice(0,10).replace(/-/g,"");
    
    if (deadline === yestS){
        m.messages.send(escalate, function(res) {
            log(res);
        }, function(err) {
            log(err);
        });
    }
    else if (deadline === tomS){
        m.messages.send(reminder, function(res) {
            log(res);
        }, function(err) {
            log(err);
        });
    }
}