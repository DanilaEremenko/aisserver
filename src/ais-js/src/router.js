import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            alias: '/vessels',
            name: 'vessels',
            component: () => import('./components/VesselList')
        },
        {
            path: '/vessels/:id',
            name: 'edit-vessel',
            component: () => import('./components/EditVessel')
        },
        {
            path: '/add',
            name: 'add-vessel',
            component: () => import('./components/AddVessel')
        }
    ]
})