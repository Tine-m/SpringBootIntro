# Undervisningsnote

# Netværk
Det centrale du skal kende til for at kunne forstå netværks programmering er:

IP-adresser - computerens “telefon nummer” på internettet
Port-numre - hvilket program på computeren ønsker man at tale med
Protokol - hvordan skal vi snakke når der er oprettet forbindelse

# Internettets opbygning
Når man skriver en URL i browseren og får svar tilbage fra serveren kommer alle dele i brug.

En http URL ser ud på denne måde: http://ipaddress:port/path?query.

## IP-adresse
Der er to forskellige måder måder at angive en ip adresse. D
els kan man angive selve IP adressen. Det er fire tal mellem 0 og 255. Et eksempel kunne være DR's hjemmeside som har 159.20.6.38, 
eller Facebook der har 31.13.64.35.

Som bekendt behøver man ikke at skrive http://159.20.6.38, 
hvis man vil se DR's hjemmeside. Din computer benytter sig af nogle specielle computere der er på nettet der hedder “DNS” (Domain Name System). En DNS er en computer på nettet som har en tabel over hvilken ip adresse der hører til hvilket navn. Din browser har inbygget en række velkendte DNS (google har f.eks. en DNS på 8.8.8.8).

Ved hjælp af en IP adresse kan du få fat i en anden computer på internettet.