var port = 8000;
var express = require('express');
var app = express();
app.get('/', function(request, response) {
    console.log({id: request.query.secid});
});

app.listen(port, () => {
    console.log(`Example app listening at http://localhost:${port}`)
})
