package com.app.bse.bsemanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.app.bse.bsemanager.Adapters.EmprestimoListAdapter;
import com.app.bse.bsemanager.Beans.Cliente;
import com.app.bse.bsemanager.Beans.Emprestimo;

public class InformacoesActivity extends Activity {

    private EmprestimoListAdapter adapter;
    private ListView lista;
    private Cliente cliente;
    private TextView txtNome;
    private TextView txtCpf;
    private TextView txtMatricula;
    private TextView txtRg;
    private TextView txtConvenio;
    private TextView txtTel;
    private TextView txtTel2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes);

        cliente = (Cliente) getIntent().getSerializableExtra("cliente");

        txtNome = (TextView) findViewById(R.id.tv_informacoes_nome);
        txtCpf = (TextView) findViewById(R.id.tv_informacoes_cpf);
        txtMatricula = (TextView) findViewById(R.id.tv_informacoes_matricula);
        txtRg = (TextView) findViewById(R.id.tv_informacoes_rg);
        txtConvenio = (TextView) findViewById(R.id.tv_informacoes_convenio);
        txtTel = (TextView) findViewById(R.id.tv_informacoes_tel1);
        txtTel2 = (TextView) findViewById(R.id.tv_informacoes_tel2);

        txtNome.setText(cliente.getNome());
        txtCpf.setText(cliente.getCpf());
        txtMatricula.setText(String.valueOf(cliente.getMatricula()));
        txtRg.setText(cliente.getRg());
        txtConvenio.setText(cliente.getConvenio());
        txtTel.setText(cliente.getTel1());
        txtTel2.setText(cliente.getTel2());

// Não mexa aqui por enquanto ---------------------------------------------------
        lista = (ListView) findViewById(R.id.list_emprestimos);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {




            }
        });
    }

    public void buscarEmprestimos(View view){

        adapter = new EmprestimoListAdapter(this, Emprestimo.getEmprestimos());

        lista.setAdapter(adapter);

    }
}
