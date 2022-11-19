package com.example.haranojishkhujepai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haranojishkhujepai.databinding.FragmentLoginBinding;
import com.example.haranojishkhujepai.viewmodel.LoginViewModel;

public class LoginFragment extends Fragment {
    private LoginViewModel loginViewModel;
    private FragmentLoginBinding binding;
    private boolean isLogin;


    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater,container,false);
        loginViewModel = new ViewModelProvider(requireActivity())
                .get(LoginViewModel.class);
        binding.loginBtn.setOnClickListener(v -> {
            isLogin = true;
            authenticate();
        });
        binding.registerBtn.setOnClickListener(v -> {
            isLogin = false;
            authenticate();
        });
        loginViewModel.getStateLiveData()
                .observe(getViewLifecycleOwner(), authState -> {
                    if (authState == LoginViewModel.AuthState.AUTHENTICATED) {
                        Navigation.findNavController(container)
                                .navigate(R.id.login_to_home_list_action);
                    }
                });

        loginViewModel.getErrMsgLiveData()
                .observe(getViewLifecycleOwner(), errMsg -> {
                    binding.errMsgTV.setText(errMsg);
                });



        return binding.getRoot();
    }
    private void authenticate() {
        final String email = binding.emailInputET.getText().toString();
        final String password = binding.passwordInputET.getText().toString();

        if (isLogin) {
            loginViewModel.login(email, password);
        }else {
            loginViewModel.register(email, password);
        }
    }
}