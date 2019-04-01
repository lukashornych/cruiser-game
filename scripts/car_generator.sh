#!/bin/bash

function listData {
    echo "--List of $1 data-----------------------"
    cat "$dataPath/$1"
    echo "----------------------------------------"
}

# block name, code name
function writeCNBlock {
    echo -e "#$1\ncn:$2" >> "$outputFilePath"
}

# block name, code name, damage
function writeCNWithDamageBlock {
    writeCNBlock $1 $2
    echo -e "damage:$3" >> "$outputFilePath"
}

# code name, fuel level
function writeFuelTankBlock {
    writeCNBlock "fueltank" $1
    echo -e "fuellevel:$2" >> "$outputFilePath"
}

# code name, boost pressure, idle rpm, max rpm, launch rpm, launch control on, eop, fisop
function writeEcuBlock {
    writeCNBlock "ecu" $1
    echo -e "bp:$2\nidlerpm:$3\nmaxrpm:$4\nlaunchrpm:$5\nlco:$6\neop:$7\nfisop:$8" >> "$outputFilePath"
}

# srs, sps, hu, speakers, seat
function writeInteriorBlock {
    echo -e "#interior\nsrs:$1\nsps:$2\nhu:$3\nspeakers:$4\nseat:$5" >> "$outputFilePath"
}

echo "Cruiser game car generator"
echo "-> type rules:"
echo "- floats: 0.0 - 1.0"
echo "- empty: NONE"
echo "- boolean: TRUE, FALSE"

echo "-> type car data dir path (without last /):"
read dataPath
echo ""

echo "-> type car output file path:"
read outputFilePath
echo ""

listData "cars_data.csv"
echo "-> type car code name:"
read carCodeName
echo ""

listData "engines_data.csv"
echo "-> type engine code name:"
read engineCodeName
echo ""

listData "pistons_data.csv"
echo "-> type pistons code name:"
read pistonsCodeName
echo ""

echo "-> type pistons damage (float):"
read pistonsDamage
echo ""

listData "crankshafts_data.csv"
echo "-> type crankshaft code name:"
read crankshaftCodeName
echo ""

echo "-> type crankshaft damage (float):"
read crankshaftDamage
echo ""

listData "camshafts_data.csv"
echo "-> type camshaft code name:"
read camshaftCodeName
echo ""

listData "intakemanifolds_data.csv"
echo "-> type intake manifold code name:"
read intakeManifoldCodeName
echo ""

listData "airfilters_data.csv"
echo "-> type air filter code name:"
read airfilterCodeName
echo ""

listData "exhausts_data.csv"
echo "-> type exhaust code name:"
read exhaustCodeName
echo ""

listData "radiators_data.csv"
echo "-> type radiator code name:"
read radiatorCodeName
echo ""

listData "turbochargers_data.csv"
listData "superchargers_data.csv"
echo "-> type fis code name:"
read fisCodeName
echo ""

echo "-> type fis damage (float):"
read fisDamage
echo ""

listData "intercoolers_data.csv"
echo "-> type intercooler code name (if you chose turbo):"
read intercoolerCodeName
echo ""

listData "ecus_data.csv"
echo "-> type ecu code name:"
read ecuCodeName
echo ""

echo "-> type ecu boost pressure (psi):"
read ecuBP
echo ""

echo "-> type ecu idle rpm:"
read ecuIdleRpm
echo ""

echo "-> type ecu max rpm:"
read ecuMaxRpm
echo ""

echo "-> type ecu launch rpm:"
read ecuLaunchRpm
echo ""

echo "-> type ecu launch on (boolean):"
read ecuLaunchOn
echo ""

echo "-> type eop temp. (0 = not set):"
read eop
echo ""

echo "-> type fisop temp. (0 = not set):"
read fisop
echo ""

listData "valves_data.csv"
echo "-> type valves code name:"
read valvesCodeName
echo ""

echo "-> type valves damage (float):"
read valvesDamage
echo ""

listData "fuelpumps_data.csv"
echo "-> type fuel pump code name:"
read fuelPumpCodeName
echo ""

listData "fueltanks_data.csv"
echo "-> type fuel tank code name:"
read fuelTankCodeName
echo ""

echo "-> type fuel tank level (float):"
read fuelTankLevel
echo ""

listData "transmissions_data.csv"
echo "-> type transmission code name:"
read transmissionCodeName
echo ""

echo "-> type transmission damage (float):"
read transmissionDamage
echo ""

listData "tires_data.csv"
echo "-> type tires code name:"
read tiresCodeName
echo ""

echo "-> type tires damage:"
read tiresDamage
echo ""

listData "differentials_data.csv"
echo "-> type differential code name:"
read differentialCodeName
echo ""

echo "-> type stripped rear seats (boolean):"
read srs
echo ""

echo "-> type stripped passenger seat (boolean):"
read sps
echo ""

listData "hus_data.csv"
echo "-> type head unit code name:"
read huCodeName
echo ""

listData "speakers_data.csv"
echo "-> type speakers code name:"
read speakersCodeName
echo ""

listData "seats_data.csv"
echo "-> type seat code name:"
read seatCodeName
echo ""

echo "generating..."

touch $outputFilePath
writeCNBlock "car" $carCodeName
writeCNBlock "engine" $engineCodeName
writeCNWithDamageBlock "pistons" $pistonsCodeName $pistonsDamage
writeCNWithDamageBlock "crankshaft" $crankshaftCodeName $crankshaftDamage
writeCNBlock "camshaft" $camshaftCodeName
writeCNBlock "intakemanifold" $intakeManifoldCodeName
writeCNBlock "airfilter" $airfilterCodeName
writeCNBlock "exhaust" $exhaustCodeName
writeCNBlock "radiator" $radiatorCodeName
writeCNWithDamageBlock "fis" $fisCodeName $fisDamage
writeCNBlock "intercooler" $intercoolerCodeName
writeEcuBlock $ecuCodeName $ecuBP $ecuIdleRpm $ecuMaxRpm $ecuLaunchRpm $ecuLaunchOn $eop $fisop
writeCNWithDamageBlock "valves" $valvesCodeName $valvesDamage
writeCNBlock "fuelpump" $fuelPumpCodeName
writeFuelTankBlock $fuelTankCodeName $fuelTankLevel
writeCNWithDamageBlock "transmission" $transmissionCodeName $transmissionDamage
writeCNWithDamageBlock "tires" $tiresCodeName $tiresDamage
writeCNBlock "differential" $differentialCodeName
writeInteriorBlock $srs $sps $huCodeName $speakersCodeName $seatCodeName

echo "done!"
exit
