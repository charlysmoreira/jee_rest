package com.uece.jeerest.enumerations;

import com.uece.jeerest.interfaces.Strategy;

public enum Cargo implements Strategy {

	GERENTE {

		@Override
		public double execute(int valor) {
			return valor + (valor * PERC_GERENT);
		}
	},

	ATENDENTE {
		@Override
		public double execute(int valor) {
			return valor + (valor * PERC_ATEND);
		}
	},

	PRESIDENTE {

		@Override
		public double execute(int valor) {
			return valor + (valor * PERC_PRESID);
		}
	};

}
