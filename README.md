# Undervisningsnote

# Netværk
Det centrale du skal kende til for at kunne forstå netværksprogrammering er:

- IP-adresser - computerens “telefonnummer” på internettet
- Port-numre - hvilket program på computeren ønsker man at tale med
- Protokol - hvordan vi skal snakke, når der er oprettet forbindelse

## Internettets opbygning
Når man skriver en URL i browseren og får svar tilbage fra serveren kommer alle dele i brug.

En HTTP URL ser ud på denne måde: http://ipaddress:port/path?query.

## IP-adresse
Der er to forskellige måder måder at angive en IP adresse. 
Dels kan man angive selve IP adressen. Det er fire tal mellem 0 og 255. Et eksempel kunne være DR's hjemmeside som har 159.20.6.38, 
eller Facebook der har 31.13.64.35.

Som bekendt behøver man ikke at skrive http://159.20.6.38, 
hvis man vil se DR's hjemmeside. 
Din computer benytter sig af nogle specielle computere, der er på nettet der hedder “DNS” (Domain Name System). 
En DNS er en computer på nettet, som har en tabel over hvilken IP adresse, der hører til hvilket navn. Din browser har indbygget en række velkendte DNS (Google har f.eks. en DNS på 8.8.8.8).

Ved hjælp af en IP adresse kan du få fat i en anden computer på internettet.

# Server, Port
Normalt beder vi vores browser om at hente en HTML side på en server (ud fra dens IP addresse). Hvis man ikke skriver noget specielt, så vil browseren henvende sig på port 80, som er standardporten for en web server. 
Men vi kan bede servere om meget andet end html sider. 
Vi kan bede en mail server om at levere os emails, vi kan bede en mail server om at sende emails, vi kan bede om skærmdeling osv.

<p>Når vi prøver at få fat i en server, skal der være et program på denne server, der er parat til at håndtere denne henvendelse. 
For at serveren kan håndtere mere end en type af henvendelser, er der flere programmer der kan køre samtidigt, og de får hver sit portnummer. 
En webserver lytter ofte på port 80, men kan man kan bruge et vilkårligt portnummer. 
Der er visse begrænsninger på portnumre under 1024 da de er 

[reserveret til diverse standarder](https://en.wikipedia.org/wiki/List_of_TCP_and_UDP_port_numbers)
<p>Bemærk - man kan godt have klient og server på samme maskine. Der er et særligt navn der hedder localhost (som har ip nummer 127.0.0.1).</p>

## Klient og Server
I eksemplerne ovenfor er det en browser der snakker med en webserver. 
Serveren er den der har et program der sidder og venter på, at der kommer en henvendelse. Klienten er det program der henvender sig.

## HTTP
HTTP er en protokol som bruges mellem en browser (klienten) og en webserver.

Generelt beskriver en protokol hvad serveren regner med at klienten skriver til serveren, og hvad klienten kan forvente at serveren svarer.

Hvis vi i IntelliJ lokalt på egen maskine starter en Tomcat webserver, 
kan vi fra en browser skrive http://localhost:8080/welcome.html, hvorefter server programmet svarer browseren med følgende besked (HTTP response message-Header info):

![image](src/main/resources/images/http_response_header.PNG)

Og selve indholdet af HTML siden (HTTP response message-Body):

![image](src/main/resources/images/http_response_body.PNG)