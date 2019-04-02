# Car file structure
- version 0.1
- how save file for car should look like
- static parts info (like torque increase etc.) are fetched from static table file by part code name
- file extension - ccf

## Coding
- part section
    - start -> starts by part code
    - end -> ends with another part code
- part
    - `#*code*`
- value
    - `*code*:*value*` 
    - common codes:
        - code name = cn
        - damage = damage
- empty part code name => "NONE"

## Structure
- car *(code: car)*
    - code name
- engine *(code: engine)*
    - code name
- pistons *(code: pistons)*
    - code name
    - damage
- crankshaft *(code: crankshaft)*
    - code name
    - damage
- camshaft *(code: camshaft)*
    - code name
- intake manifold *(code: intakemanifold)*
    - code name
- air filter *(code: aitfilter)*
    - code name
- exhaust *(code: exhaust)*
    - code name
- radiator *(code: radiator)*
    - code name
- forced induction system *(code: fis)*
    - code name
    - damage
    - *turbocharger addition*
        - intercooler
- intercooler *(code: intercooler)*
    - code name
- ecu *(code: ecu)*
    - code name
    - boost pressure *(code: bp)*
    - idle rpm *(code: idlerpm)*
    - max RPM *(code: maxrpm)*
    - launch RPM *(code: launchrpm)*
    - launch control on *(code: lco)*
    - engine overheat protection temperature (0 = not set, default value) *(code: eop)*
    - forced induction system overheat protection temperature (0 = not set, default value) *(code: fisop)*
- valves *(code: valves)*
    - code name
    - damage
- fuel pump *(code: fuelpump)*
    - code name
- fuel tank *(code: fueltank)*
    - code name
    - fuel level *(code: fuellevel)*
- transmission *(code: transmission)*
    - code name
    - damage
- tires *(code: tires)*
    - code name
    - damage
- differential *(code: differential)*
    - code name
- body *(code: body)*
    - color (rgba)
- interior *(code: interior)*
    - stripped rear seats *(code: srs)*
    - stripped passenger seat *(code: sps)*
    - head unit code name *(code: hu)*
    - speakers code name *(code: speakers)*
    - driver seat code name *(code: seat)*
- brakes *(code: brakes)*
    - code name
    - damage

### Example car file
```
#car
cn:tsupra
#engine
cn:2jz
#pistons
cn:default
damage:0 -> (0% - 100%)
#crankshaft
cn:default
damage:20
#camshaft
cn:default
#intakemanifold
cn:default
#aitfilter
cn:kn1
#exhaust
cn:default
#radiator
cn:default
#fis
cn:tc1
damage:0
#intercooler
cn:default
#ecu
cn:default
bp:10 -> (psi)
idlerpm:800
#rl
maxrpm:7500
launchrpm:0 -> (not set)
lco:false
#eop
turnedon:true
temp:140
#fisop
turnedon:false
temp:0 -> (not set)
#valves
cn:default
damage:0
#fuelpump
cn:default
#fueltank
cn:default
fuellevel:50 (0% - 100%)
#transmission
cn:default
damage:0
#tires
cn:toto195xr15
damage:20
#differential
cn:default
#interior
srs:false
sps:false
#hu
cn:jcc12
#speakers
cn:axon55
```