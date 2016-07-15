package com.app.bse.bsemanager.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.app.bse.bsemanager.Beans.Cliente;
import com.app.bse.bsemanager.R;

import java.util.List;

/**
 * Created by João on 07/07/2016.
 */

public class ClienteListAdapter extends BaseAdapter {

    private List<Cliente> clientes;
    private LayoutInflater inflater;

    public ClienteListAdapter(Context context, List<Cliente> clientes) {

        this.clientes = clientes;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return clientes.size();
    }

    @Override
    public Object getItem(int position) {
        return clientes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(R.layout.adapter_clientes, parent, false);

        Cliente cliente = clientes.get(position);

        TextView txtnome = (TextView) view.findViewById(R.id.nomeCliente);
        TextView txtCpf = (TextView) view.findViewById(R.id.cpf_Cliente);


        txtnome.setText(cliente.getNome());
        txtCpf.setText("CPF: " + cliente.getCpf());

        return view;
    }
}
