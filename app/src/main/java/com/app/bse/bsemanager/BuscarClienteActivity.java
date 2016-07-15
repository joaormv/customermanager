package com.app.bse.bsemanager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.app.bse.bsemanager.Adapters.ClienteListAdapter;
import com.app.bse.bsemanager.Beans.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BuscarClienteActivity extends Activity {


    private ClienteListAdapter adapter;
    private ListView view_clientes;
    private List<Cliente> clientes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cliente);

        view_clientes = (ListView) findViewById(R.id.busca_list);

        //Registra o listener de clique sobre o item e o método a ser chamado no clique
        view_clientes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                exibirInformacoesClientes(position);

            }
        });

    }

    public void buscar(View view){

        String cpf;
        EditText txtCpf = (EditText) findViewById(R.id.busca_et_cpf);
        cpf = String.valueOf(txtCpf.getText());

        //##########################################
        //              Chamada de Webservice      #
        //##########################################
        clientes = Cliente.getClientes();
        //##########################################

        adapter = new ClienteListAdapter(this, clientes);

        view_clientes.setAdapter(adapter);
    }

    public void exibirInformacoesClientes(int position){

        Intent intent = new Intent(this, InformacoesActivity.class);
        intent.putExtra("cliente",clientes.get(position));
        startActivity(intent);

    }


}
