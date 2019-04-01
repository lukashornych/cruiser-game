# Cruiser
- version 0.3
- written by masonorovic

# Overview
- open source open world car game with working buildings (like garages, shops, petrol stations etc) and working traffic and modifying cars
- only singleplayer (at least at the beginning)

# Features
## Car
- can be bought from a junkyard (with some parts missing or broken, for cheap) or new from a car seller
- can be tuned and upgraded completely (or completely stripped)
    - engine, drivetrain, body etc.
- customisable car's cluster (HUD)
    - every car has real cluster shape where you can buy spare gauges any kind (RPM, speed, fuel level, temps)
    - no limitations other than the shape
    - factory cluster cannot be modifyed, only swaped for custom player's one
- parts can break or wear (eg. tires)
- cars should have kind of real physics (real acceleration, braking, steering, drifting, understeer etc.)
- can be sold to a junkyard or car sellers
- broken car can be towed for some money to a garage
- a car has fully functional fuel tank (player has to refill the tank)

### Modifyable parts
#### Engine
- pistons - can only take some power or it starts to break
- crankshaft - can only take some power or it starts to break
- camshaft - adds power
- intake manifold 
- air filter - flow resistance
- exhaust - adds power, changes sound little bit
- boost
    - turbocharger
        - intercooler - protects turbocharger from overheating
    - supercharger
- radiator - can only take some power before engine overheats
- ECU - adds power, boost pressure, protections (overheating, rev limiter), 2 step, idle RPM
- ventils - propably can take only some RPMs
- fuel pump - with raising power player has to get pump with more power
- fuel tank - different size and it's weight (depends on fuel level)

#### Drivetrain
- transmission - different efficiency, different sound of dogbox, different gear ratios (short and long)
- tires - coefficient, diameter (different speed)
- differencial - changeable final gear ratio

#### Body
- color - only mate colors (because of art style)
- stickers
- tinted windows
- headlights - different viewing distance and colors
- tinted fog lights - just cosmetic
- changeable hoods - different intakes support different hoods

#### Interior
- interior stripping - saves weight
- audio system (radio and speakers) - player can or cannot play his music

### Wearing parts out
- tires - burnouts and drifts wore tires more
    - after wear out car is driving on rims only -> very bad handling
- more boost that engine can handle
    - damages:
        - pistons
        - crankshaft
        - camshaft
        - ventils
- more boost that turbocharger or supercharger can handle
    - damages engine because of boost
    - damages charger
- engine overheating
    - a lot of overheat can damage engine entirely
- turbocharge overheating
    - a lot of overheat can damage turbo entirely
- RPMs over rev limiter
    - more RPMs over limit more damage
    - wears parts in engine:
        - pistons
        - crankshaft
        - camshaft
        - boost
        - ventils
- brakes
    - braking wears brakes linearly

## Game world
- completely open world
- day-night cycle
- changing weather (sunny, rain)
- parts: city, curvy roads out of city, small villages
- special places: junkyard, garages to buy, car sellers, car shops, old school drive-ins for nights meetings, petrol stations
- working traffic
- time can be skipped

## Garage
- main player's place to work on cars
- stores all player's cars
- player can buy multiple garages
    - everything is synchronized between all garages
- an unlimited space for cars and parts
- a car there can be upgraded and tuned (from bought parts)
  
## Shops
- specialised shops for different kinds of car parts and petrol stations
- player have to drive there by a car and take bought parts to a garage
- a reserved parking place on a street next to a shop to get into the shop 
    - to some special shop you can get by driving the car into the shop "garage"
  
## Night car meetings
- at a old school drive-in
- street races
- every night

## Street racing
- all kinds of races
    - sprint, circuit, drag, maybe from a point A to a point B races
- usually at night
- between two cars
- possible fines
- player has to put in some money (same as opponent)
    - in case of win he gets his and opponent's money
    - in case of loss he loses his put money

## Side jobs
### Taxi
- player can take taxi job where he gets cab and in the game world there marked people who wants to carry somewhere
- then he has finish point in map and time for that
- after each passenger player gets money

### Delivery
- in city there is some company which offers delivery job
- player has to get there by his own car
- then he gets delivery van and delivery place
    - usually there are several packages to deliver in one take then he gets money

# Target platform
- Linux (main)
- later maybe possible move to mobile platforms

# Target audience
- those who know at least some basic fact about cars (something like Pixel car racing)
  
# Game
## Main single player mode
- at the beginning player gets money to buy car from a junkyard which he then drives to his only garage
- after buying first car player can do everything (races, jobs, modifying etc.) from beginning, only limitation is money
- to earn money player can start racing or get side jobs

# Interface
## Controls
### Keyboard
- player can customise every button
- default settings:
    - throttle: W, arrow up
    - brake: S, arrow down
    - steering: A-D, arrows left and right
    - handbrake: SPACE
    - activate/enter: ENTER
    - pause: ESC
    - dimmed lights: L
    - high beams: K
    - up shift: left and right SHIFT
    - down shift: left and right CONTROL
    - clutch: ALT, ALT GR
    - automatic transmission mode switch: E
    - map: M

## Main menu
- simple screen with slightly blurred garage from the outside
- options:
    - new game
    - load game
        - multiple separate saved games
    - game settings
        - video settings
        - controls
    - basic info about game
    - quit

## Pause menu
- options:
    - controls settings
    - teleport to garage (fuel is cost)
    - map
    - quit

## Gameplay HUD
- at the bottom there is car's cluster
- somewhere in a corner can be minimap
- pointers which shows incoming cars
- radio control in a bottom corner

## Map
- fullscreen map view of whole world with marked out all special places
- can be zoomed and dragged
- new garages can be bought there

## Garage
- the selected car in the middle of screen
- around car there are clickable tools to modify car
- on the car there are clickable icon to modify specific car sections (like engine, drivetrain, body, interior etc.) which then shows full interface to change every parts that can be changed (in slots)
- radio control

## Car selection
- to get there player has to click on a door or something in a garage
- displayed as a backyard parking lot of a garage where player's car are parked in parking lots next to each other
- selection is made by player's click on a car

## Petrol stations
- activated by a petrol station refill place run over 
- player can choose between a regular petrol and a more expensive race fuel (which adds some power)
- player chooses how many liters do he want (limited by a fuel tank real capacity)

## Shops
- activated by a special parking lot in front of a shop
- parts are sorted in shelfs (something like in Pixel car racer)

## Drive-ins
- activated by a special parking lot in front of drive-in
- opponents cars drive through and player can accept it or not (like in Street Rods)
- after a opponent select player chooses bet

## Junkyard
- activated by a junkyard gate
- a big parking lot where player can choose car and see what it has and it's price
- button to sell cars

## Car sellers
- activated by a gate
- a parking lot where player can choose car and see basic info about car and it's price
- button to sell cars

# Art style
- a cartoon styled graphics, not real textures (something like Drift rods)

# Music/Sound
- real car engine sounds and ambient city and nature sounds
- music is played by radio put in special folder in system by player

# Dev plan
1. basic car model
    - basic physics from real parameters
    - changeable car parts
    - working fuel tank
2. game world basics
    - how roads will be built 
    - how building and interactive building will be working
3. car selection with basic garage without ability to modify car
4. car sellers
5. petrol stations
6. car shops basics
    - working car parts buying
7. modifying car in garages
8. drive-in with only drag races
9. ...