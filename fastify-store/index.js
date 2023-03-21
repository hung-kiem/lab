const fastify = require('fastify')({ logger: true })
const PORT = 3000

fastify.get('/', async () => {
    return { hello: 'world' }
})

const serve = async () => {
try {
        await fastify.listen(PORT)
        fastify.log.info(`server listening on ${fastify.server.address().port}`)
    } catch (err) {
        fastify.log.error(err)
        process.exit(1)
    }
}

serve()

const mongoose = require('mongoose')
//setup DB
const mongoUrl ="mongodb://127.0.0.1:27017/fastify-store"

try {
    mongoose.connect(mongoUrl, {
        useNewUrlParser: true,
        useUnifiedTopology: true
    })
    console.log("Database connected sucessfully");
} catch (error) {
    console.log(error);
}

const routes = require("./bookRoutes")
routes.forEach((route, index) => {
    fastify.route(route)
});