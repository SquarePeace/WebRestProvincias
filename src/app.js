var  ProvinciaService = require('./Services/Provincia');
var  MunicipioService = require('./Services/Municipio');
var  DistritoService = require('./Services/Distrito');
var  express = require('express');
var  bodyParser = require('body-parser');
var  cors = require('cors');
var  app = express();
var  router = express.Router();

app.use(bodyParser.urlencoded({ extended:  true }));
app.use(bodyParser.json());
app.use(cors());
app.use('/api', router);

router.use((request, response, next) => {
    console.log('middleware');
    next();
});

// Provincias routers 

router.route('/provincias').get((request, response) => {
    ProvinciaService.getProvincias().then((data) => {
    response.json(data[0]);
    })
})

router.route('/provincias/:id').get((request, response) => {
    ProvinciaService.getProvincia(request.params.id).then((data) => {
    response.json(data[0]);
    })
})

router.route('/provincias/:id/municipios').get((request, response) => {
    ProvinciaService.findMunicipioByProvincia(request.params.id).then((data) => {
    response.json(data[0]);
    })
})

router.route('/provincias/:id/distritos_municipales').get((request, response) => {
    ProvinciaService.findDistritoByProvincia(request.params.id).then((data) => {
    response.json(data[0]);
    })
})

// Municipios routers

router.route('/municipios').get((request, response) => {
    MunicipioService.getMunicipios().then((data) => {
    response.json(data[0]);
    })
})

router.route('/municipios/:id').get((request, response) => {
    MunicipioService.getMunicipio(request.params.id).then((data) => {
    response.json(data[0]);
    })
})

router.route('/municipios/:id/distritos_municipales').get((request, response) => {
    MunicipioService.findDistritosByMunicipio(request.params.id).then((data) => {
    response.json(data[0]);
    })
})

//// Distritos Municipales routers

router.route('/distritos_municipales').get((request, response) => {
    DistritoService.getDistritos().then((data) => {
    response.json(data[0]);
    })
})

router.route('/distritos_municipales/:id').get((request, response) => {
    DistritoService.getDistrito(request.params.id).then((data) => {
    response.json(data[0]);
    })
})

var  port = process.env.PORT || 8090;
app.listen(port);
console.log('API is runnning at ' + port);

