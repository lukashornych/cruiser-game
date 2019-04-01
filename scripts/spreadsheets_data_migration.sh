#!/bin/bash

spreadsheetsPath="/media/lukin/Data/LocalCoding/cruiser-game/data/cars_data/spreadsheets/"
outputPath="/media/lukin/Data/LocalCoding/cruiser-game/cruiser-game/core/assets/cars_data/parts_data/"

# echo "Type spreadsheets directory:"
# read spreadsheetsPath

# echo "Type output directory:"
# read outputPath

carsPath="cars_data.ods"
enginesPath="engines_data.ods"
pistonsPath="pistons_data.ods"
crankshaftsPath="crankshafts_data.ods"
camshaftsPath="camshafts_data.ods"
intakemanifoldsPath="intakemanifolds_data.ods"
aitfiltersPath="airfilters_data.ods"
exhaustsPath="exhausts_data.ods"
radiatorsPath="radiators_data.ods"
turbochargersPath="turbochargers_data.ods"
superchargesPath="superchargers_data.ods"
intercoolersPath="intercoolers_data.ods"
ecusPath="ecus_data.ods"
valvesPath="valves_data.ods"
fuelpumpsPath="fuelpumps_data.ods"
fueltanksPath="fueltanks_data.ods"
drivetrainsPath="drivetrains_data.ods"
transmissionsPath="transmissions_data.ods"
tiresPath="tires_data.ods"
differentialsPath="differentials_data.ods"
husPath="hus_data.ods"
speakersPath="speakers_data.ods"
seatsPath="seats_data.ods"
brakesPath="brakes_data.ods"

cd "$spreadsheetsPath"

libreoffice --headless --convert-to csv "$spreadsheetsPath$carsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$enginesPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$pistonsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$crankshaftsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$camshaftsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$intakemanifoldsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$aitfiltersPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$exhaustsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$radiatorsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$turbochargersPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$superchargesPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$intercoolersPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$ecusPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$valvesPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$fuelpumpsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$fueltanksPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$drivetrainsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$transmissionsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$tiresPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$differentialsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$husPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$speakersPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$seatsPath"
libreoffice --headless --convert-to csv "$spreadsheetsPath$brakesPath"

sed -i 's/,/;/g' "$spreadsheetsPath${carsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${enginesPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${pistonsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${crankshaftsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${camshaftsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${intakemanifoldsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${aitfiltersPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${exhaustsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${radiatorsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${turbochargersPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${superchargesPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${intercoolersPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${ecusPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${valvesPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${fuelpumpsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${fueltanksPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${drivetrainsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${transmissionsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${tiresPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${differentialsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${husPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${speakersPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${seatsPath/%ods/csv}"
sed -i 's/,/;/g' "$spreadsheetsPath${brakesPath/%ods/csv}"

tail -n +3 "$spreadsheetsPath${carsPath/%ods/csv}" > "$outputPath${carsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${enginesPath/%ods/csv}" > "$outputPath${enginesPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${pistonsPath/%ods/csv}" > "$outputPath${pistonsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${crankshaftsPath/%ods/csv}" > "$outputPath${crankshaftsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${camshaftsPath/%ods/csv}" > "$outputPath${camshaftsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${intakemanifoldsPath/%ods/csv}" > "$outputPath${intakemanifoldsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${aitfiltersPath/%ods/csv}" > "$outputPath${aitfiltersPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${exhaustsPath/%ods/csv}" > "$outputPath${exhaustsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${radiatorsPath/%ods/csv}" > "$outputPath${radiatorsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${turbochargersPath/%ods/csv}" > "$outputPath${turbochargersPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${superchargesPath/%ods/csv}" > "$outputPath${superchargesPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${intercoolersPath/%ods/csv}" > "$outputPath${intercoolersPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${ecusPath/%ods/csv}" > "$outputPath${ecusPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${valvesPath/%ods/csv}" > "$outputPath${valvesPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${fuelpumpsPath/%ods/csv}" > "$outputPath${fuelpumpsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${fueltanksPath/%ods/csv}" > "$outputPath${fueltanksPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${drivetrainsPath/%ods/csv}" > "$outputPath${drivetrainsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${transmissionsPath/%ods/csv}" > "$outputPath${transmissionsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${tiresPath/%ods/csv}" > "$outputPath${tiresPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${differentialsPath/%ods/csv}" > "$outputPath${differentialsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${husPath/%ods/csv}" > "$outputPath${husPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${speakersPath/%ods/csv}" > "$outputPath${speakersPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${seatsPath/%ods/csv}" > "$outputPath${seatsPath/%ods/csv}"
tail -n +3 "$spreadsheetsPath${brakesPath/%ods/csv}" > "$outputPath${brakesPath/%ods/csv}"

rm *.csv