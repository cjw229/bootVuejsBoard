import Vue from 'vue';
import Router from 'vue-router';
import StoreList from '@/components/store/StoreList';
import Store from '@/components/store/Store';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'StoreList',
      component: StoreList,
    }, {
      path: '/store/:storeId',
      name: 'store',
      component: Store,
    },
  ],
});
