
Problem Statement:
 Satellite Command System Programming Exercise Problem Statement You are tasked with developing a Satellite Command System that simulates controlling a satellite in orbit. The satellite starts in a default initial state and can accept a series of commands to change its orientation, solar panel status, and data collection. Functional Requirements


Compile : javac .\Satelitehandle\*.java

Run : java Satelitehandle/MissionControlDemo


OUTPUT:

----------------------------------------------------
? Satellite Initialized and Operational.
--- Current Satellite State ---
  Orientation:    North
  Solar Panels:   Inactive
  Data Collected: 0
-------------------------------
----------------------------------------------------

----------------------------------------------------
         MISSION CONTROL COMMAND INTERFACE
----------------------------------------------------
Available Commands (Case-Insensitive):
  1. ROTATE [DIRECTION]  -> e.g., ROTATE NORTH
     Directions: NORTH, SOUTH, EAST, WEST
  2. ACTIVATE            -> Activates Solar Panels
  3. DEACTIVATE          -> Deactivates Solar Panels
  4. COLLECT             -> Collects Data (Requires Active Panels)
  5. STATUS              -> Print current satellite state
  6. HELP                -> Display this help message
  7. QUIT / EXIT         -> Terminate the program
----------------------------------------------------

FLIGHT DIRECTOR > ROTATE NORTH
[EXECUTING]
? ROTATE: Changing orientation from 'North' to 'North'.

FLIGHT DIRECTOR > ROTATE SOUTH
[EXECUTING]
? ROTATE: Changing orientation from 'North' to 'South'.

FLIGHT DIRECTOR > STATUS
--- Current Satellite State ---
  Orientation:    South
  Solar Panels:   Inactive
  Data Collected: 0
-------------------------------

FLIGHT DIRECTOR > COLLECT
[EXECUTING]
? FAILURE: Cannot collect data. Solar panels are 'Inactive'. Must be Active.

FLIGHT DIRECTOR > ACTIVATE
[EXECUTING]
? PANELS: Solar panels ACTIVATED. Ready to collect data.

FLIGHT DIRECTOR > COLLECT  
[EXECUTING]
? DATA: Collected 10 units. Total data: 10.

FLIGHT DIRECTOR > COLLECT
[EXECUTING]
? DATA: Collected 10 units. Total data: 20.

FLIGHT DIRECTOR > DEACTIVATE
[EXECUTING]
? PANELS: Solar panels DEACTIVATED.

FLIGHT DIRECTOR > COLLECT    
[EXECUTING]
? FAILURE: Cannot collect data. Solar panels are 'Inactive'. Must be Active.

FLIGHT DIRECTOR > INVALID COMMAND
INVALID COMMAND: Type 'HELP' for a list of valid commands.

FLIGHT DIRECTOR > STATUS
--- Current Satellite State ---
  Orientation:    South
  Solar Panels:   Inactive
  Data Collected: 20
-------------------------------

FLIGHT DIRECTOR > QUIT
Closing Mission Control. Goodbye.

SATELLITE HEALTH REPORT (Final State):
--- Current Satellite State ---
  Orientation:    South
  Solar Panels:   Inactive
  Data Collected: 20
-------------------------------