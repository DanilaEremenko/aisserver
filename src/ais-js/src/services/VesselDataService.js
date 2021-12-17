import http from '../http-common'

class VesselDataService {
    getAll() {
        return http.get('http://localhost:54322/vessel')
    }

    get(id) {
        return http.get(`http://localhost:54322/vessel/${id}`)
    }

    create(data) {
        return http.post('http://localhost:54322/vessel', data)
    }

    update(id, data) {
        return http.put(`http://localhost:54322/vessel/${id}`, data)
    }

    delete(id) {
        return http.delete(`http://localhost:54322/vessel/${id}`)
    }
}

export default new VesselDataService()