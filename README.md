# 📚 BookFinderWebSite 🌐

## Descrizione

BookFinderWebSite è un sito web basato su spring utilizato per consultare i libri più cercati e i libri che gli utenti
hanno aggiunto più frequentemente tra i preferiti

## 🚀 Installazione del servizio

### Prerequisiti

- [Java JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Microsoft Azure Subscription
- Maven
- IntelliJ

### Tipi di risorse utilizzate

- App Spring di Azure
- Azure SQL

### Deployment risorse in cloud

#### Setup di Base

La creazione di qualsiasi tipo di risorsa nel cloud Azure necessita di una subscription. Accedere al portale Azure
tramite account Microsoft, selezionare la voce Subscriptions > Add e seguire i passaggi indicati. Una volta fatto verrà
mostrata la pagina della subscription appena creata; da qui recarsi al menù Resource Groups e creare un nuovo gruppo di
risorse. Ora si è pronti alla creazione delle risorse necessarie al progetto.
* **

### App Spring di Azure

1. Accedere al portale di Azure e selezionare "Create a resource".
2. Cerca "Azure App Service" e seleziona "Create".
3. Configurare l'istanza di Azure App Service come richiesto, inclusi il nome dell'istanza, l'abbonamento di Azure, la
   regione e le impostazioni di sicurezza.
4. Selezionare "Create" per creare l'istanza di Azure App Service.
5. Una volta creata l'istanza di Azure App Service, è possibile utilizzarla per ospitare le applicazioni Spring.
6. Scaricare ed installare l'IDE Intellij.
7. Installare il plug-in Azure Toolkit for Intellij attraverso la sezione "Plugin" delle preferenze dell'IDE.
8. Creare un nuovo progetto Spring in Intellij, selezionando la versione di Java 17.
9. Configurare il progetto Spring come richiesto, inclusi i file di configurazione e le dipendenze.
10. Utilizzare il plug-in Azure Toolkit for Intellij per eseguire il deploy dell'applicazione Spring sull'istanza di
    Azure App Service. Ciò consente di gestire il processo di deployment direttamente dall'IDE.
11. Selezionare l'istanza di Azure App Service desiderata nell'elenco delle risorse di Azure, quindi selezionare "Deploy
    to Web App".
12. Configurare le impostazioni di deployment, inclusi il file JAR, il server di destinazione e le impostazioni di
    sicurezza.
13. Selezionare "Deploy" per effettuare il deployment dell'applicazione Spring sull'istanza di Azure App Service.
14. Utilizzare l'API di Azure App Service per connettersi all'istanza e interagire con l'applicazione Spring. Ad
    esempio, è possibile utilizzare l'API REST di Azure App Service per eseguire operazioni di gestione come lo start e
    lo stop dell'istanza.
15. Gestire e monitorare l'istanza di Azure App Service utilizzando le funzionalità di gestione di Azure, tra cui il
    monitoraggio delle prestazioni, la scalabilità automatica e la gestione degli errori.

* **

### Azure SQL

1. Accedere al portale di Azure e selezionare "Create a resource".
2. Cerca "Azure SQL" e seleziona "Create".
3. Configurare l'istanza di Azure SQL come richiesto, inclusi il nome dell'istanza, il tipo di deployment, l'abbonamento
   di Azure e le impostazioni di sicurezza.
4. Selezionare "Create" per creare l'istanza di Azure SQL.
5. Una volta creata l'istanza di Azure SQL, è possibile utilizzarla per archiviare e gestire i dati.
6. Per accedere all'istanza di Azure SQL, è possibile utilizzare uno strumento di gestione del database, come SQL Server
   Management Studio o Azure Data Studio.
7. Utilizzare le credenziali fornite durante la configurazione per effettuare il login all'istanza di Azure SQL.
8. Creare un nuovo database all'interno dell'istanza di Azure SQL, utilizzando uno strumento di gestione del database o
   una query SQL.
9. Creare tabelle e altri oggetti del database all'interno del nuovo database, utilizzando uno strumento di gestione del
   database o una query SQL.
10. Utilizzare l'API di Azure SQL per connettersi al database e interagire con i dati. Per esempio, si può utilizzare
    una libreria per Java come Java JBDC.

* **

## 🧠 Installazione 🧠

Il progetto contiene tutto il necessario per il funzionamento

Per utilizzare basta clonare il progetto con git:

```
git clone https://github.com/BookManagerProject/BookFinderWebsite.git
```

Utilizzare una qualsiasi IDE per lo sviluppo e test (Si consiglia IntelliJ IDEA)
