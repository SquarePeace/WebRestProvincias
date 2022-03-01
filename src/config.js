const  config = {
    user:  'sa', // sql user
    password:  'UXd&*grkU&D^', //sql user password
    server:  'localhost', // if it does not work try- localhost
    database:  'proof',
    options: {
    trustedconnection:  true,
    enableArithAbort:  true,
    instancename:  'MSSQLSERVER',  // SQL Server instance name
    trustServerCertificate: true
    },
    port:  1433
}

module.exports = config;