var config = require("../config");
const sql = require("mssql");

async function getMunicipios() {
    try {
        let pool = await sql.connect(config);
        let municipios = await pool.request().query("SELECT MunicipioID as Codigo, Nombre FROM Municipios");
        return municipios.recordsets;
    } catch (error) {
        console.log(error);
    }
}

async function getMunicipio(MunicipioId) {
    try {
    let  pool = await  sql.connect(config);
    let  municipio = await  pool.request()
    .input('id', sql.Int, MunicipioId)
    .query("SELECT MunicipioID as codigo, nombre FROM Municipios WHERE MunicipioID = @id");
    return  municipio.recordsets;
    }
    catch (error) {
    console.log(error);
    }
}

async function findDistritosByMunicipio(MunicipioId){
    try {
    let  pool = await  sql.connect(config);
    let  Distritos = await  pool.request()
    .input('id', sql.Int, MunicipioId)
    .query("SELECT DistritoID as codigo, nombre FROM dbo.DistritosMunicipales m WHERE m.MunicipioId = @id");
    return  Distritos.recordsets;
    }
    catch (error) {
    console.log(error);
    }
}

module.exports = {
    getMunicipios: getMunicipios,
    getMunicipio: getMunicipio,
    findDistritosByMunicipio: findDistritosByMunicipio
}