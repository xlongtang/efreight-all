Ext.define('MyApp.model.InventoryVModel', {
	extend: 'Ext.data.Model',
	fields: [
		{ name: 'cInventoryID', type: 'int' },
		{ name: 'cWarehouseID', type: 'int' },
		{ name: 'cMoveID', type: 'int' },
		{ name: 'cMoveLineID', type: 'int' },
		{ name: 'orderCd'},
		{ name: 'dateOrdered', type: 'date' },
		{ name: 'departOrgID', type: 'int' },
		{ name: 'departOrgName'},
		{ name: 'destOrgID', type: 'int' },
		{ name: 'destOrgName'},
		{ name: 'consignorOrg'},
		{ name: 'consignorBPartnerID', type: 'int' },
		{ name: 'consignorOrgName'},
		{ name: 'consignorName'},
		{ name: 'consignorPhone'},
		{ name: 'consigneeBPartnerID', type: 'int' },
		{ name: 'consigneeName'},
		{ name: 'consigneePhone'},
		{ name: 'cOrderID', type: 'int' },
		{ name: 'cOrderLineID', type: 'int' },
		{ name: 'goodsName'},
		{ name: 'goodsPackage'},
		{ name: 'amount', type: 'int' },
		{ name: 'weight', type: 'float' },
		{ name: 'volume', type: 'float' },
		{ name: 'price', type: 'float' },
		{ name: 'totalCharge', type: 'float' },
		{ name: 'commentReceipt'},
		{ name: 'commentOrder'}
	]
});