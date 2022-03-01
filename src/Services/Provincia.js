var config = require("../config");
const sql = require("mssql");

async function getProvincias() {
    try {
        let pool = await sql.connect(config);
        let products = await pool.request().query("SELECT * FROM Provincias");
        return products.recordsets;
    } catch (error) {
        console.log(error);
    }
}

async function getProvincia(provinciaId) {
    try {
    let  pool = await  sql.connect(config);
    let  provincia = await  pool.request()
    .input('id', sql.Int, provinciaId)
    .query("SELECT * FROM Provincias WHERE ProvinciaId = @id");
    return  provincia.recordsets;
    }
    catch (error) {
    console.log(error);
    }
}

async function findMunicipioByProvincia(provinciaId) {
    try {
    let  pool = await  sql.connect(config);
    let  Municipios = await  pool.request()
    .input('id', sql.Int, provinciaId)
    .query("SELECT MunicipioID as codigo, Nombre FROM dbo.Municipios m WHERE m.ProvinciaID = @id");
    return  Municipios.recordsets;
    }
    catch (error) {
    console.log(error);
    }
}

async function findDistritoByProvincia(provinciaId) {
    try {
    let  pool = await  sql.connect(config);
    let  distritos = await  pool.request()
    .input('id', sql.Int, provinciaId)
    .query("SELECT DistritoID as codigo, Nombre FROM dbo.DistritosMunicipales dm WHERE dm.MunicipioID IN (SELECT MunicipioID FROM dbo.Municipios m WHERE m.ProvinciaID = @id)");
    return  distritos.recordsets;
    }
    catch (error) {
    console.log(error);
    }
}

module.exports = {
    getProvincias:  getProvincias,
    getProvincia: getProvincia,
    findDistritoByProvincia: findDistritoByProvincia,
    findMunicipioByProvincia: findMunicipioByProvincia
}