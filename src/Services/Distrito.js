var config = require("../config");
const sql = require("mssql");

async function getDistritos() {
    try {
        let pool = await sql.connect(config);
        let distritos = await pool.request().query("SELECT DistritoID as codigo, nombre FROM DistritosMunicipales");
        return distritos.recordsets;
    } catch (error) {
        console.log(error);
    }
}

async function getDistrito(distritoID) {
    try {
    let  pool = await  sql.connect(config);
    let  distrito = await  pool.request()
    .input('id', sql.Int, distritoID)
    .query("SELECT DistritoID as codigo, nombre FROM DistritosMunicipales WHERE DistritoID = @id");
    return  distrito.recordsets;
    }
    catch (error) {
    console.log(error);
    }
}

module.exports = {
    getDistritos: getDistritos,
    getDistrito: getDistrito
}