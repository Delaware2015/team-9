// Create a function to log the response from the Mandrill API
function log(obj) {
    $('#response').text(JSON.stringify(obj));
}

// create a new instance of the Mandrill class with your API key
//var mandrill = require('mandrill-api/mandrill');
var m = new mandrill.Mandrill('sTfSo_LFFJd5d-m3mKrP7Q');

// create a variable for the API call parameters




function sendTheMail(task,userName,userEmail,patronEmail,deadline) {
// Send the email!
    var reminder = {
    "message": {
        "from_email":"team9@code4good.com",
        "to":[{"email":userEmail}],
        "subject": "Reminder: " + task + "due " + deadline,
        "text": "Hi "+ userName + "! You have " + task + " due tomorrow! Let's start working on it!"
    }
};
    var escalate = {
        "message": {
            "from_email":"team9@code4good.com",
            "to":[{"email":patronEmail}],
            "subject": "Missed Deadline: " + task + "missed ",
            "text": "Hi there! It appears " + userName + " has " + task + " missed the task due on " + deadline
        }
    };
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