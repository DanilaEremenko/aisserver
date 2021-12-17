import axios from 'axios'

export default axios.create({
    baseURL: "http://localhost:54322/api",
    headers: {
        'Content-Type': 'application/json'
    }
})