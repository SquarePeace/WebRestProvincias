require('dotenv').config();


if (process.env.NODE_ENV === "development") {
var config = {
    user: "sa", // sql user
    password: "UXd&*grkU&D^", //sql user password
    server: process.env.DATABASE_DEV_URL, // if it does not work try- localhost
    database: "proof",
    options: {
    trustedconnection: true,
    enableArithAbort: true,
      instancename: "MSSQLSERVER", // SQL Server instance name
    trustServerCertificate: true,
    },
    port: 1433,
};
}
if (process.env.NODE_ENV === "docker") {
var config = {
    user: "sa", // sql user
    password: "UXd&*grkU&D^", //sql user password
    server: process.env.DATABASE_DOCKER_URL, // if it does not work try- localhost
    database: "proof",
    options: {
    trustedconnection: true,
    enableArithAbort: true,
      instancename: "MSSQLSERVER", // SQL Server instance name
    trustServerCertificate: true,
    },
    port: 1433,
};
}

module.exports = config;
