package com.app.bse.bsemanager.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.app.bse.bsemanager.Beans.Emprestimo;
import com.app.bse.bsemanager.R;

import java.util.List;


/**
 * Created by João on 13/07/2016.
 */

public class EmprestimoListAdapter extends BaseAdapter {

    private List<Emprestimo> emprestimos;
    private LayoutInflater inflater;

    public EmprestimoListAdapter(Context context, List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return emprestimos.size();
    }

    @Override
    public Object getItem(int position) {
        return emprestimos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(R.layout.adapter_emprestimo_list, parent, false);

        Emprestimo emprestimo = emprestimos.get(position);

        TextView txtBanco = (TextView) view.findViewById(R.id.adp_emprestimo_banco);
        TextView txtValor = (TextView) view.findViewById(R.id.adp_emprestimo_valor);
        TextView txtParcelas = (TextView) view.findViewById(R.id.adp_emprestimo_qntParcelas);

        txtBanco.setText(emprestimo.getBanco());
        txtValor.setText(String.valueOf(emprestimo.getValor()));
        txtParcelas.setText(String.valueOf(emprestimo.getQntParcelas()));

        return view;
    }
}
