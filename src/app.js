var  ProvinciaService = require('./Services/Provincia');
var  Provincia = require('./Models/Provincia');
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

router.route('/provincias').get((request, response) => {
    ProvinciaService.getProvincias().then((data) => {
    response.json(data[0]);
    })
})

router.route('/provincia/:id').get((request, response) => {
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

var  port = process.env.PORT || 8090;
app.listen(port);
console.log('API is runnning at ' + port);

