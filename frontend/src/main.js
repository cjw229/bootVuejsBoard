// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import axios from 'axios';
import vueAxios from 'vue-axios';
import App from './App';
import router from './router';

Vue.config.productionTip = false;

axios.defaults.headers.common['Access-Control-Allow-Origin'] = 'http://localhost:8080';
axios.defaults.headers.common['Access-Control-Request-Method'] = '*';
axios.defaults.baseURL = process.env.API_HOST;

console.log(axios.defaults.baseURL);

Vue.use(vueAxios, axios);


/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  template: '<App/>',
  components: { App },
});
