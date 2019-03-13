# Conference-Track-Management
This project is a Conference Track Management system, You can upload a file that meets the requirements, then parsing the file and turning it into a meeting plan that meets the requirements.

## How to run ?
- 1.Import project into eclipse or intellji.
- 2.Config jdk>=1.8.
- 3.Select Application.java run as java application,then you will see the message in the console.
- 4.Follow the console message, input a signals file path.
- 5.Follow the console message, input the msg id.
- 6.The msg info in the console.

## How to run unit test?
- 1.Import project into eclipse or intellij.
- 2.select project and click run all tests.

## Format for Signal File

    Writing Fast Tests Against Enterprise Rails 60min
    Overdoing it in Python 45min
    Lua for the Masses 30min
    Ruby Errors from Mismatched Gem Versions 45min
    Common Ruby Errors 45min
    Rails for Python Developers lightning
    Communicating Over Distance 60min
    Accounting-Driven Development 45min
    Woah 30min
    Sit Down and Write 30min
    Pair Programming vs Noise 45min
    Rails Magic 60min
    Ruby on Rails: Why We Should Move On 60min
    Clojure Ate Scala (on my project) 45min
    Programming in the Boondocks of Seattle 30min
    Ruby vs. Clojure for Back-End Development 30min
    Ruby on Rails Legacy App Maintenance 60min
    A World Without HackerNews 30min
    User Interface CSS in Rails Apps 30min
      
*  The conference has multiple tracks each of which has a morning and afternoon session.
*  Each session contains multiple talks.
*  Morning sessions begin at 9am and must finish before 12 noon, for lunch.
*  Afternoon sessions begin at 1pm and must finish in time for the networking event.
*  The networking event can start no earlier than 4:00 and no later than 5:00.
*  No talk title has numbers in it.
*  All talk lengths are either in minutes (not hours) or lightning (5 minutes).
*  Presenters will be very punctual; there needs to be no gap between sessions.

## Output

- Track 1:
- 9:00AM Writing Fast Tests Against Enterprise Rails 60min
- 10:00AM Communicating Over Distance 60min
- 11:00AM Rails Magic 60min
- 12:00PM lauch
- 1:00PM Ruby on Rails: Why We Should Move On 60min
- 2:00PM Ruby on Rails Legacy App Maintenance 60min
- 3:00PM Overdoing it in Python 45min
- 3:45PM Ruby Errors from Mismatched Gem Versions 45min
- 4:30PM Lua for the Masses 30min
- 5:00PM Networking Event
- Track 2:
- 9:00AM Common Ruby Errors 45min
- 9:45AM Accounting-Driven Development 45min
- 10:30AM Pair Programming vs Noise 45min
- 11:15AM Clojure Ate Scala (on my project) 45min
- 12:00PM lauch
- 1:00PM Woah 30min
- 1:30PM Sit Down and Write 30min
- 2:00PM Programming in the Boondocks of Seattle 30min
- 2:30PM Ruby vs. Clojure for Back-End Development 30min
- 3:00PM A World Without HackerNews 30min
- 3:30PM User Interface CSS in Rails Apps 30min
- 4:00PM Rails for Python Developers lightning 5min
- 4:05PM Networking Event
