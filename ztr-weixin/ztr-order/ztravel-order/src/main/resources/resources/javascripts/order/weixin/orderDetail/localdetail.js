/**
 *
 */
$(document).ready(function(){
	FastClick.attach(document.body);//防击穿
	orderDetailInit.initPrg();
	contactor.init();
	passenger.init();
	orderDetailInit.initToPay();
	orderDetailInit.initToComment();
	orderDetailInit.initStateShow();
});