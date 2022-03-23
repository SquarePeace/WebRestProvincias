var supertest = require("supertest"); //require supertest
const request = supertest("http://localhost:8090/"); //supertest hits the HTTP server
var jest = require("jest")
describe("Get all provincias", () => {
try {
    beforeEach(function () {
    console.log("Get all provincias ");
    });

    afterEach(function () {
    console.log("All provincias' details are retrieved");
    });
    jest.setTimeout(5000)
    test('GET provincias output', async (done) => {
        const response = await request().get('/api/provincias')
        .expect(200)
        .then((response) => {
            console.log("GET RESPONSE : ", response.body);
            done();
            });
        });

} catch (err) {
    console.log("Exception : ", err);
}
});
